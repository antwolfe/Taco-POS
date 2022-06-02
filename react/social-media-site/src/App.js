import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

import Navbar from "./components/Navbar";
import Feed from "./components/feed/Feed";
import CurrentUser from "./components/users/CurrentUser";

const App = () => {
  return (
    <div className="ui">
      <h1 className="ui center aligned header">Social Media App</h1>
      <Router>
        <Navbar />
        <div className="ui container">
          <Routes>
            <Route path="/" element={<Feed />} />
            <Route path="/profile" element={<CurrentUser />} />
          </Routes>
        </div>
      </Router>
    </div>
  );
};

export default App;
