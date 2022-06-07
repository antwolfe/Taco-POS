import React from "react";

export default function CartTotal(props) {
  const { cartItems } = props;

  const itemTotal = cartItems.map((item) => {
    if (item.id) {
      return item.price * item.qty;
    }
  });

  function realTotal(items) {
    var total = 0;
    for (var i in items) {
      total += items[i];
    }
    return total;
  }

  return <div>$ {realTotal(itemTotal).toFixed(2)}</div>;
}
