import React from "react";
import Button from "react-bootstrap/esm/Button";
import { useLocation } from "react-router-dom";
import HomeBar from "./HomeBar";

export default function ProductDetail() {
  const location = useLocation();
  let book = location.state.props;
  return (
    <div>
      <div className="detail-item">
        <h2 className="book-title">{book.title}</h2>
        <img className="book-cover" src="/" alt="book cover" />
      </div>
      <div className="detail-content">
        <p>{book.price}</p>
        <p>Book Description</p>
        <Button variant="primary">ADD TO CART</Button>
        <Button variant="success">BUY NOW</Button>
      </div>
      {/* <HomeBar /> */} {/* might remove */}
    </div>
  );
}
