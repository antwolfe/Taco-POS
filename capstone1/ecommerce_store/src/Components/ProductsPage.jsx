import React from "react";
import Button from "react-bootstrap/Button";
import HomeBar from "./HomeBar";

export default function ProductsPage() {
  return (
    <div>
      <div className="book-item">
        <img className="book-cover" src="/" alt="TITLE cover" />
        <span>
          <h2 className="book-title">Book Title</h2>
          <h5 className="book-price">Book Price</h5>
          <a href="/">
            <Button className="btn">See Details</Button>
          </a>
        </span>
      </div>
      <HomeBar />
    </div>
  );
}
