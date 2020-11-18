import React from 'react';
import styled from 'styled-components';
import Burger from './Burger';

const Nav = styled.nav`
    width: 100%;
    height: 65px;
    border-bottom: 2px solid #f1f1f1;
    padding: 0 20px;
    display: flex;
    justify-content: space-between;
    background-color: #81b214;
    z-index: 999 !important;

    .navigation {
    }

    .logo {
      height: 65px;
      object-fit: contain;
    }
`;

const Navbar = () => {
  return (
      <Nav>
        <div className="navigation">
           <img className="logo" alt="" src="/images/logo.jpg" />
        </div>
        <Burger />
      </Nav>
  )
}

export default Navbar