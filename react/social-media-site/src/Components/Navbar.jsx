import React from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

function Navbar() {
  return (
    <div className="ui attached stackable menu">
      <div className="ui container">
        <a className="item">
          <Link to="/">
            <i className="home icon"></i> Home
          </Link>
        </a>
        <a className="item">
          <Link to="/profile">
            <i className="edit icon"></i> Profile
          </Link>
        </a>
        <a className="item">
          <Link to="/">
            <i className="grid layout icon"></i> Browse
          </Link>
        </a>
        <div className="ui simple dropdown item">
          More
          <i className="dropdown icon"></i>
          <div className="menu">
            <a className="item">
              <Link to="/">
                <i className="mail icon"></i> Messages
              </Link>
            </a>
          </div>
        </div>
        <div className="right item">
          <div className="ui input">
            <input type="text" placeholder="Search" />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Navbar;
