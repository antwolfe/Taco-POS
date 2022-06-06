import React, { useState } from "react";
import { Link } from "react-router-dom";
import { FaShoppingCart } from "react-icons/fa";
import Search from "../Components/Search";

export default function NavBar({ products }) {
  return (
    <div>
      <nav className="navbar">
        <Link to="/">
          <h1>KingBooks</h1>
        </Link>
        <input
          onChange={(e) => <Search products={products} query={e} />}
          type="search"
          name="search"
          placeholder="Search..."
        />

        <Link to="/cart">
          <FaShoppingCart className="cart-icon" size="30px" alt="cart icon" />
        </Link>
      </nav>
    </div>
  );
}
