import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import { useLocation } from "react-router-dom";
import AddToCartModal from "../Components/AddToCartModal";
import OnAdd from "../Components/OnAdd";
import Basket from "./Basket";
import HomeBar from "./HomeBar";

export default function ProductDetail(props) {
  const location = useLocation();
  let book = location.state.product;

  const { setCartItems } = props;

  // const fillCart = (book) => {
  //   setCartItems(book);
  // };

  return (
    <div>
      <div className="detail-item">
        <h2 className="book-title">{book.title}</h2>
        <img className="book-cover" src="/" alt="book cover" />
      </div>
      <div className="detail-content">
        <p>{book.price}</p>
        <p>Book Description</p>
        <Button
          variant="primary"
          onClick={() => {
            setCartItems(book);
          }}
        >
          ADD TO CART
        </Button>
        <Button variant="success">BUY NOW</Button>
      </div>
      {/* <HomeBar /> */} {/* might remove */}
    </div>
  );
}
