import axios from 'axios'
import { config } from '../Constants'

export const userExtrasMeAPI = {
  getUserExtrasMe,
  saveUserExtrasMe
}

function getUserExtrasMe(token) {
  return instance.get(`/api/userextras/me`, {
    headers: { 'Authorization': bearerAuth(token) }
  })
}

function saveUserExtrasMe(token, userExtra) {
  return instance.post(`/api/userextras/me`, userExtra, {
    headers: { 'Authorization': bearerAuth(token) }
  })
}

// -- Axios

const instance = axios.create({
  baseURL: config.url.API_BASE_URL
})

instance.interceptors.response.use(response => {
  return response
}, function (error) {
  if (error.response.status === 404) {
    return { status: error.response.status }
  }
  return Promise.reject(error.response)
})

// -- Helper functions

function bearerAuth(token) {
  return `Bearer ${token}`
}
