import React from "react";

function Navbar() {
  return (
    <div class="ui attached stackable menu">
      <div class="ui container">
        <a class="item">
          <i class="home icon"></i> Home
        </a>
        <a class="item">
          <i class="edit icon"></i> Profile
        </a>
        <a class="item">
          <i class="grid layout icon"></i> Browse
        </a>
        <div class="ui simple dropdown item">
          More
          <i class="dropdown icon"></i>
          <div class="menu">
            <a class="item">
              <i class="mail icon"></i> Messages
            </a>
          </div>
        </div>
        <div class="right item">
          <div class="ui input">
            <input type="text" placeholder="Search" />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Navbar;
