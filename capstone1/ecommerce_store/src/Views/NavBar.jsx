import React from "react";
import { Link } from "react-router-dom";

export default function NavBar() {
  return (
    <div>
      <nav className="navbar">
        <Link to="/">
          <h1>KingBooks</h1>
        </Link>
        <input type="text" name="search" placeholder="Search..." />
        <a href="/">
          <img src="/" alt="cart" />
        </a>
      </nav>
    </div>
  );
}
