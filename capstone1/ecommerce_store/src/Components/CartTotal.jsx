import React from "react";

export default function CartTotal({ cartItems }) {
  console.log(cartItems);
  const prices = cartItems.map((item) => item.price);
  console.log(prices);

  const subtotal = prices.reduce((acc, curr) => acc + curr, 0);

  console.log(subtotal);
  return <div>CartTotal</div>;
}
