import React from 'react';
import PropTypes from 'prop-types';
import { makeStyles } from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import Typography from '@material-ui/core/Typography';
import Box from '@material-ui/core/Box';
import Language from '../Language';
import { useTranslation } from 'react-i18next';
import AboutMe from '../AboutMe';
import './NavTabs.css';
import Experiences from '../Experiences';
import Footer from '../Footer';

function TabPanel(props) {
  const { children, value, index, ...other } = props;

  return (
    <div
      role="tabpanel"
      hidden={value !== index}
      id={`nav-tabpanel-${index}`}
      aria-labelledby={`nav-tab-${index}`}
      {...other}
    >
      {value === index && (
        <Box p={0}>
          {children}
        </Box>
      )}
    </div>
  );
}

TabPanel.propTypes = {
  children: PropTypes.node,
  index: PropTypes.any.isRequired,
  value: PropTypes.any.isRequired,
};

function a11yProps(index) {
  return {
    id: `nav-tab-${index}`,
    'aria-controls': `nav-tabpanel-${index}`,
  };
}

function LinkTab(props) {
  return (
    <Tab
      component="a"
      onClick={(event) => {
        event.preventDefault();
      }}
      {...props}
    />
  );
}

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
    backgroundColor: theme.palette.background.paper,
  },
}));

export default function NavTabs() {
  const classes = useStyles();
  const [value, setValue] = React.useState(0);
  const { t, i18n } = useTranslation('common');

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  return (
    <div className={classes.root}>
      <div className="nav_bar">
        <AppBar position="static"  style={{ background: "linear-gradient(to right, #0f3057, #00587a, #008891)" }}>
          <Tabs
            value={value}
            onChange={handleChange}
            aria-label="nav tabs"
            centered
          >
            <LinkTab label={t('nav.about-me')} href="/aboutme" {...a11yProps(0)} />
            <LinkTab label={t('nav.experiences')} href="/experiences" {...a11yProps(1)} />
            <LinkTab label={t('nav.language')} href="/language" {...a11yProps(2)} />
          </Tabs>
        </AppBar>
      </div>
      

      <TabPanel value={value} index={0}>
        <AboutMe />
        <Footer />
      </TabPanel>
      <TabPanel value={value} index={1}>
        <Experiences />
        <Footer />
      </TabPanel>
      <TabPanel value={value} index={2}>
        <Language />
        <Footer />
      </TabPanel>
    </div>
  );
}
