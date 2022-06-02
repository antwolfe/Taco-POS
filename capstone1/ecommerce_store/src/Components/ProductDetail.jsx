import React from "react";
import Button from "react-bootstrap/esm/Button";
import HomeBar from "./HomeBar";

export default function ProductDetail() {
  return (
    <div>
      <div className="detail-item">
        <h2 className="book-title">Book Title</h2>
        <img className="book-cover" src="/" alt="book cover" />
      </div>
      <div className="detail-content">
        <p>Book Price</p>
        <p>Book Description</p>
        <Button variant="primary">ADD TO CART</Button>
        <Button variant="success">BUY NOW</Button>
      </div>
      <HomeBar />
    </div>
  );
}
