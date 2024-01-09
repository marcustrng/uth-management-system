import React from "react";
import ReactDOM from "react-dom";

import "./index.css";
import App from "./App";
import {ContextProvider} from "./Contexts/ContextProvider";
import Keycloak from "keycloak-js";
import {config} from "./Constants";
import {Dimmer, Header, Icon} from "semantic-ui-react";
import {ReactKeycloakProvider} from '@react-keycloak/web'

const keycloak = new Keycloak({
  url: `${config.url.KEYCLOAK_BASE_URL}`,
  realm: "uth-oidc-dev",
  clientId: "uth-client"
})
const initOptions = {pkceMethod: 'S256'}

const handleOnEvent = async (event, error) => {
  if (event === 'onAuthSuccess') {
    if (keycloak.authenticated) {
      console.log("keycloak", keycloak);

      localStorage.setItem(keycloak.token,
          JSON.stringify({
            email: keycloak.idTokenParsed.email,
            family_name: keycloak.idTokenParsed.family_name,
            given_name: keycloak.idTokenParsed.given_name,
            preferred_username: keycloak.idTokenParsed.preferred_username,
            is_student: keycloak?.tokenParsed?.resource_access?.['uth-client']?.roles?.includes(
                'UMS_STUDENT') ?? false
          }));

      // const item = JSON.parse(localStorage.getItem(keycloak.token)).preferred_username;

      console.log("authenticated !")
    }
  }
}

const loadingComponent = (
    <Dimmer inverted active={true} page>
      <Header style={{color: '#4d4d4d'}} as='h2' icon inverted>
        <Icon loading name='cog'/>
        <Header.Content>Keycloak is loading
          <Header.Subheader style={{color: '#4d4d4d'}}>or running
            authorization code flow with PKCE</Header.Subheader>
        </Header.Content>
      </Header>
    </Dimmer>
)

ReactDOM.render(
    <ReactKeycloakProvider
        authClient={keycloak}
        initOptions={initOptions}
        LoadingComponent={loadingComponent}
        onEvent={(event, error) => handleOnEvent(event, error)}
    >
      <ContextProvider>
        <App/>
      </ContextProvider>
    </ReactKeycloakProvider>
    ,
    document.getElementById("root")
);
