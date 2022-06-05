import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";
import CartTotal from "../Components/CartTotal";
import QtyTotal from "../Components/QtyTotal";

export default function Basket(props) {
  const [total, setTotal] = useState(0);
  // useEffect(() => {
  //   setTotal(total + purchasePrice);
  // }, [qty]);

  const addTotal = (product, cartItems, qty) => {};
  const { cartItems, onDelete } = props;

  return (
    <div>
      <h2 className="text-center"> Cart Items </h2>
      <div className="cart">
        {cartItems.map((item) => {
          return (
            <div key={item.id}>
              <CartItem
                product={item}
                onDelete={onDelete}
                cartItems={cartItems}
              />
            </div>
          );
        })}
        <div className="cart-total text-center">
          <CartTotal cartItems={cartItems} />
        </div>
        <div className="d-grid gap-2">
          <Button variant="dark" size="lg" className="cart-checkout-btn">
            CHECKOUT
          </Button>
        </div>
      </div>
    </div>
  );
}
