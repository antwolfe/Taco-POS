import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";

export default function Basket(props) {
  const { cartItems, setCartItems } = props;

  const isCartEmpty = () => {
    if (cartItems.length === 0) {
      return <div>Cart is empty</div>;
    } else {
      return <div>Cart is not empty</div>;
    }
  };

  //   <div>
  //     {cartItems.map((item) => {
  //       <div key={item.id}>
  //         <div>{item.name}</div>
  //         <div>
  //           <Button onClick={() => onAdd(item)}>Add 1</Button>
  //         </div>
  //       </div>;
  //     })}
  //   </div>
  // }

  // console.log(cartItems);
  return (
    <div>
      <h2> Cart Items </h2>
      {isCartEmpty()}
      <Button variant="primary">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
