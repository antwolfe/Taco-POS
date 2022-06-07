import React from "react";
import { FaHome, FaBookOpen, FaShoppingCart } from "react-icons/fa";
import { Link } from "react-router-dom";

export default function HomeBar() {
  return (
    <div>
      <div className="homebar">
        <Link to="/">
          <FaHome alt="home icon" size="30px" />
          <p> Home </p>
        </Link>
        <Link to="/products/">
          <FaBookOpen alt="search icon" size="30px" />
          <p>Browse All Products</p>
        </Link>
        <Link to="/cart">
          <FaShoppingCart alt="cart icon" size="30px" />
          <p> Cart </p>
        </Link>
      </div>
    </div>
  );
}
