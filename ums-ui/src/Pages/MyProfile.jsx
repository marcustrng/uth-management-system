import React, {useEffect, useState} from 'react';
import {Header} from '../Components';
import {useForm} from 'react-hook-form';
import {studentAPI} from '../Service/StudentAPI'
import {useKeycloak} from "@react-keycloak/web";
import {handleLogError} from "../Utilities/Helpers";

const MyProfile = () => {
  const {keycloak} = useKeycloak();

  const [isLoading, setIsLoading] = useState(false)
  const [myProfile, setMyProfile] = useState([])

  useEffect(() => {
    const fetchMyProfile = async () => {
      setIsLoading(true)
      try {
        const userData = JSON.parse(localStorage.getItem(keycloak.token));
        console.log("userData", userData);

        const response = await studentAPI.getUserProfile(keycloak.token,
            userData.preferred_username);
        console.log("response", response);
        const userProfileData = response.data

        setMyProfile(userProfileData)
      } catch (error) {
        handleLogError(error)
      } finally {
        setIsLoading(false)
      }
    }
    fetchMyProfile().then(r => console.log(r))
  }, [keycloak.token])

  return (
      isLoading ? <></> : (
          <div className='m-2 md:m-10 mt-24 p-2 md:p-10 bg-white rounded-3xl '>
            <Header category="Page" title="My Profile"/>

            <form className="w-full max-w-full px-20">
              <h2 className="text-4xl font-extrabold dark:text-white pb-5">Education
                information</h2>

              <div className="flex flex-wrap -mx-3 mb-6">
                <div className="w-full md:w-1/2 px-3">
                  <label
                      className="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2"
                      htmlFor="grid-last-name">
                    Last Name
                  </label>
                  <input
                      className="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 leading-tight focus:outline-none focus:bg-white focus:border-gray-500"
                      id="grid-last-name" type="text" placeholder="Doe" readOnly={true}/>
                </div>
                <div className="w-full md:w-1/2 px-3">
                  <label
                      className="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2"
                      htmlFor="grid-last-name">
                    Last Name
                  </label>
                  <input
                      className="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 leading-tight focus:outline-none focus:bg-white focus:border-gray-500"
                      id="grid-last-name" type="text" placeholder="Doe" readOnly={true}/>
                </div>
              </div>



              <h2 className="text-4xl font-extrabold dark:text-white py-5">Personal
                information</h2>


            </form>

          </div>
      )
  )
}

export default MyProfile
