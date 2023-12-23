import React from 'react'
import { useKeycloak } from '@react-keycloak/web'

function PrivateRoute({ children }) {
    const { keycloak } = useKeycloak()

    const Login = () => {
        console.log("keycloak", keycloak);
        keycloak.login().then(r => console.log("keycloak r", r))
    }

    return keycloak.authenticated ? children : <Login />
}

export default PrivateRoute