import React from "react";

export default function NavBar() {
  return (
    <div>
      <nav className="navbar">
        <h1>KingBooks</h1>
        <input type="text" name="search" placeholder="Search..." />
        <a href="/">
          <img src="/" alt="cart" />
        </a>
      </nav>
    </div>
  );
}
