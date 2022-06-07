import React, { useState, useEffect } from "react";
import Button from "react-bootstrap/esm/Button";
import { useNavigate } from "react-router-dom";
import CartItem from "../Components/CartItem";
import CartTotal from "../Components/CartTotal";

export default function Cart(props) {
  const navigate = useNavigate();

  const { cartItems, onDelete, setItems, items } = props;

  const handleCheckout = () => {
    navigate("/checkout", { replace: true });
  };

  return (
    <div>
      <h2 className="text-center cart-title"> Cart Items </h2>
      <div className="cart">
        {cartItems.map((item) => {
          return (
            <div key={item.id}>
              <CartItem
                product={item}
                onDelete={onDelete}
                cartItems={cartItems}
                items={items}
                setItems={setItems}
              />
            </div>
          );
        })}
        <div className="modify-qty"></div>
        <div className="cart-total text-center">
          <CartTotal cartItems={cartItems} />
        </div>
        <div className="d-grid gap-2 login-btn">
          <Button
            variant="dark"
            size="lg"
            className="cart-checkout-btn"
            onClick={handleCheckout}
          >
            CHECKOUT
          </Button>
        </div>
      </div>
    </div>
  );
}
