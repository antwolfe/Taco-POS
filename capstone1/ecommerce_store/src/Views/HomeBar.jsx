import React from "react";
import { FaHome, FaBookOpen, FaShoppingCart } from "react-icons/fa";
import { Link } from "react-router-dom";

export default function HomeBar() {
  return (
    <div>
      <div className="homebar">
        <Link to="/">
          <FaHome alt="home icon" size="30px" />
        </Link>
        <Link to="/products/">
          <FaBookOpen alt="search icon" size="30px" />
        </Link>
        <Link to="/cart">
          <FaShoppingCart alt="cart icon" size="30px" />
        </Link>
      </div>
    </div>
  );
}
