import React from 'react';
import ReactDOM from 'react-dom';
import {Route,
    BrowserRouter as Router,
Switch} from 'react-router-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';



ReactDOM.render(<Router><App /></Router>, document.getElementById('root') );
registerServiceWorker();
