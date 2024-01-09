import axios from 'axios'
import {config} from '../Constants'

export const studentAPI = {
  getUserProfile,

}

function getUserProfile(token, username) {
  console.log("username", username);

  return instance.get(`/ums-service-enrollment/students/1`, {
    headers: {'Authorization': bearerAuth(token)}
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
    return {status: error.response.status}
  }
  return Promise.reject(error.response)
})

// -- Helper functions

function bearerAuth(token) {
  return `Bearer ${token}`
}
