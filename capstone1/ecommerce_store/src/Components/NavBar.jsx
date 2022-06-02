import React from "react";

export default function NavBar() {
  return (
    <div>
      <nav className="navbar">
        <a href="#">
          <h1>KingBooks</h1>
        </a>
        <input type="text" name="search" placeholder="Search..." />
        <a href="/">
          <img src="/" alt="cart" />
        </a>
      </nav>
    </div>
  );
}
