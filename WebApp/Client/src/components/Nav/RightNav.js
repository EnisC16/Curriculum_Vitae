import React from 'react';
import styled from 'styled-components';
import { useTranslation} from 'react-i18next'
import { Link } from 'react-router-dom';

const Ul = styled.ul`
    list-style: none;
    display: flex;
    flex-flow: row nowrap;
    z-index: 998 !important;

    li {
        padding: 18px 20px;
        color: #fff;
        cursor:pointer;
    }

    @media(max-width: 768px) {
        flex-flow: column nowrap;
        background-color: #206a5d;
        position: fixed;
        transform: ${({ open }) => open ? 'translateX(0)' : 'translateX(100%)'};
        top: 0;
        right: 0;
        height: 100vh;
        width: 300px;
        padding-top: 3.5em;
        transition: transform 0.3s ease-in-out;
    }


`;

const RightNav = (props) => {
  const { t } = useTranslation('common');

  return (
    <Ul open={props.open} >
      <li>
        <Link to="/" onClick={() => props.closeOpen()} style={{ textDecoration: 'none', color: '#fff' }}>
          {t('nav.home')}
        </Link>
      </li>
      <li>
        <Link to="/register" onClick={() => props.closeOpen()} style={{ textDecoration: 'none', color: '#fff' }}>
          {t('nav.register')}
        </Link>
      </li>
      <li>
        <Link to="/contact" onClick={() => props.closeOpen()} style={{ textDecoration: 'none', color: '#fff' }}>
          {t('nav.contact-us')}
        </Link>
      </li>
      <li>
        <Link to="/login" onClick={() => props.closeOpen()} style={{ textDecoration: 'none', color: '#fff' }}>
          {t('nav.log-in')}
        </Link>
      </li>
      <li>
        <Link to="/donations" onClick={() => props.closeOpen()} style={{ textDecoration: 'none', color: '#fff' }}>
          {t('nav.donations')}
        </Link>
      </li>
      <li>
        <Link to="/language" onClick={() => props.closeOpen()} style={{ textDecoration: 'none', color: '#fff' }}>
          {t('nav.language')}
        </Link>
      </li>
    </Ul>
  )
}

export default RightNav