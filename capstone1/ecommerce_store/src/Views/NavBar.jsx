import React, { useState } from "react";
import { Link } from "react-router-dom";
import { FaShoppingCart } from "react-icons/fa";

export default function NavBar({ products }) {
  const [term, setTerm] = useState("");

  return (
    <div>
      <nav className="navbar">
        <Link to="/">
          <h1>KingBooks</h1>
        </Link>
        <input
          onChange={(e) => {
            setTerm(e.target.value);

            products
              .filter((val) => {
                let title = val.title;
                if (term == "") {
                  return val;
                } else if (title.toLowerCase().includes(term.toLowerCase())) {
                }
              })
              .map((title) => {
                console.log(title);
                return (
                  <div>
                    <p>{title}</p>
                  </div>
                );
              });
          }}
          type="text"
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
