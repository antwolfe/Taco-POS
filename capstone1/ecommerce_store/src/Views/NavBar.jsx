import React from "react";
import { Link } from "react-router-dom";
import { FaShoppingCart } from "react-icons/fa";

export default function NavBar() {
  return (
    <div>
      <nav className="navbar">
        <Link to="/">
          <h1>KingBooks</h1>
        </Link>
        <input type="text" name="search" placeholder="Search..." />
        <Link to="/cart">
          <FaShoppingCart size="30px" alt="cart icon" />
        </Link>
      </nav>
    </div>
  );
}
