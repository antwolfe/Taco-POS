import React from "react";
import {
  BrowserRouter as Router,
  Route,
  NavLink,
  Routes,
} from "react-router-dom";

import Navbar from "./components/Navbar";
import Feed from "./components/feed/Feed";
import UserCard from "./components/users/UserCard";

const App = () => {
  return (
    <div className="ui">
      <h1 className="ui center aligned header">Social Media App</h1>
      <Router>
        <Navbar />
        <div className="ui container">
          <Routes>
            <Route path="/" element={<Feed />} />
            <Route path="/profile" element={<UserCard />} />
          </Routes>
        </div>
      </Router>
    </div>
  );
};

export default App;
