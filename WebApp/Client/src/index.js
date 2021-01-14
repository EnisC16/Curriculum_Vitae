import React, { Suspense } from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './components/App.js';
import "./components/translation/i18next.js";
import registerServiceWorker from './components/ContactForm/registerServiceWorker';


ReactDOM.render(
  <React.StrictMode>
    <Suspense fallback="loading">
        <App/>
    </Suspense>
  </React.StrictMode>,
  document.getElementById('root')
);
registerServiceWorker();
