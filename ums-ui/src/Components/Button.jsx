import React from 'react';

import { useStateContext } from '../Contexts/ContextProvider';
import {useKeycloak} from '@react-keycloak/web'

const Button = ({
  icon,
  bgColor,
  color,
  bgHoverColor,
  size,
  text,
  borderRadius,
  width,
  isLogout
}) => {
  const {keycloak} = useKeycloak();
  const { setIsClicked, initialState } = useStateContext();

  console.log("isLogout", isLogout);
  return (
      <button
          type="button"
          onClick={() => isLogout === 1 ? keycloak.logout() : setIsClicked(initialState)}
          style={{backgroundColor: bgColor, color, borderRadius}}
          className={` text-${size} p-3 w-${width} hover:drop-shadow-xl hover:bg-${bgHoverColor}`}
      >
        {icon} {text}
      </button>
  );
};

export default Button;
