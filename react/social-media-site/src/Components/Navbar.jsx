import React from "react";
import { BrowserRouter as Router, Route, NavLink } from "react-router-dom";

function Navbar() {
  return (
    <div className="ui attached stackable menu">
      <div className="ui container">
        <a className="item">
          <i className="home icon"></i> Home
        </a>
        <a className="item">
          <i className="edit icon"></i> Profile
        </a>
        <a className="item">
          <i className="grid layout icon"></i> Browse
        </a>
        <div className="ui simple dropdown item">
          More
          <i className="dropdown icon"></i>
          <div className="menu">
            <a className="item">
              <i className="mail icon"></i> Messages
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
