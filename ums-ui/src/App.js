import React, {useEffect} from 'react';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import {FiSettings} from 'react-icons/fi';
import {TooltipComponent} from '@syncfusion/ej2-react-popups';

import {Navbar, Footer, Sidebar, ThemeSettings} from './Components';
import {
  Ecommerce,
  Orders,
  Calendar,
  Employees,
  Stacked,
  Pyramid,
  Customers,
  Kanban,
  Line,
  Area,
  Bar,
  Pie,
  Financial,
  ColorPicker,
  ColorMapping,
  Editor
} from './Pages';
import './App.css';

import {useStateContext} from './Contexts/ContextProvider';
import {ReactKeycloakProvider} from '@react-keycloak/web'
import Keycloak from 'keycloak-js'
import {Dimmer, Header, Icon} from 'semantic-ui-react'
import {config} from './Constants'

const App = () => {
  const {
    setCurrentColor,
    setCurrentMode,
    currentMode,
    activeMenu,
    currentColor,
    themeSettings,
    setThemeSettings
  } = useStateContext();

  useEffect(() => {
    const currentThemeColor = localStorage.getItem('colorMode');
    const currentThemeMode = localStorage.getItem('themeMode');
    if (currentThemeColor && currentThemeMode) {
      setCurrentColor(currentThemeColor);
      setCurrentMode(currentThemeMode);
    }
  }, []);

  const keycloak = new Keycloak({
    url: `${config.url.KEYCLOAK_BASE_URL}`,
    realm: "uth-oidc-dev",
    clientId: "uth-client"
  })
  const initOptions = {pkceMethod: 'S256'}

  const handleOnEvent = async (event, error) => {
    if (event === 'onAuthSuccess') {
      if (keycloak.authenticated) {
        // let response = await moviesApi.getUserExtrasMe(keycloak.token)
        // if (response.status === 404) {
        //   const username = keycloak.tokenParsed.preferred_username
        //   const userExtra = {avatar: username}
        //   response = await moviesApi.saveUserExtrasMe(keycloak.token, userExtra)
        //   console.log('UserExtra created for ' + username)
        // }
        // keycloak['avatar'] = response.data.avatar

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

  return (
      <ReactKeycloakProvider
          authClient={keycloak}
          initOptions={initOptions}
          LoadingComponent={loadingComponent}
          onEvent={(event, error) => handleOnEvent(event, error)}
      >
        <div className={currentMode === 'Dark' ? 'dark' : ''}>
          <BrowserRouter>
            <div className="flex relative dark:bg-main-dark-bg">
              <div className="fixed right-4 bottom-4" style={{zIndex: '1000'}}>
                <TooltipComponent
                    content="Settings"
                    position="Top"
                >
                  <button
                      type="button"
                      onClick={() => setThemeSettings(true)}
                      style={{background: currentColor, borderRadius: '50%'}}
                      className="text-3xl text-white p-3 hover:drop-shadow-xl hover:bg-light-gray"
                  >
                    <FiSettings/>
                  </button>

                </TooltipComponent>
              </div>
              {activeMenu ? (
                  <div
                      className="w-72 fixed sidebar dark:bg-secondary-dark-bg bg-white ">
                    <Sidebar/>
                  </div>
              ) : (
                  <div className="w-0 dark:bg-secondary-dark-bg">
                    <Sidebar/>
                  </div>
              )}
              <div
                  className={
                    activeMenu
                        ? 'dark:bg-main-dark-bg  bg-main-bg min-h-screen md:ml-72 w-full  '
                        : 'bg-main-bg dark:bg-main-dark-bg  w-full min-h-screen flex-2 '
                  }
              >
                <div
                    className="fixed md:static bg-main-bg dark:bg-main-dark-bg navbar w-full ">
                  <Navbar/>
                </div>
                <div>
                  {themeSettings && (<ThemeSettings/>)}

                  <Routes>
                    {/* dashboard  */}
                    <Route path="/" element={(<Ecommerce/>)}/>
                    <Route path="/ecommerce" element={(<Ecommerce/>)}/>

                    {/* pages  */}
                    <Route path="/orders" element={<Orders/>}/>
                    <Route path="/employees" element={<Employees/>}/>
                    <Route path="/customers" element={<Customers/>}/>

                    {/* apps  */}
                    <Route path="/kanban" element={<Kanban/>}/>
                    <Route path="/editor" element={<Editor/>}/>
                    <Route path="/calendar" element={<Calendar/>}/>
                    <Route path="/color-picker" element={<ColorPicker/>}/>

                    {/* charts  */}
                    <Route path="/line" element={<Line/>}/>
                    <Route path="/area" element={<Area/>}/>
                    <Route path="/bar" element={<Bar/>}/>
                    <Route path="/pie" element={<Pie/>}/>
                    <Route path="/financial" element={<Financial/>}/>
                    <Route path="/color-mapping" element={<ColorMapping/>}/>
                    <Route path="/pyramid" element={<Pyramid/>}/>
                    <Route path="/stacked" element={<Stacked/>}/>

                  </Routes>
                </div>
                <Footer/>
              </div>
            </div>
          </BrowserRouter>
        </div>
      </ReactKeycloakProvider>
  );
};

export default App;
