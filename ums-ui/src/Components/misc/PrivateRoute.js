import React from 'react'
import { useKeycloak } from '@react-keycloak/web'

function PrivateRoute({ children }) {
    const { keycloak } = useKeycloak()

    const Login = async () => {
        console.log("keycloak 1", keycloak);
        await keycloak.login()
    }

    return keycloak.authenticated ? children : <Login />
}

export default PrivateRoute
