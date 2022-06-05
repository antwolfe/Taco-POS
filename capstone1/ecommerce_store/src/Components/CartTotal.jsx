import React from "react";

export default function CartTotal(props) {
  const { cartItems, qty } = props;
  const itemsPrice = cartItems.reduce(
    (acc, item) => acc + item.price * item.qty,
    0
  );
  const totalPrice = itemsPrice;

  let itemTotal = cartItems.map((item) => {
    if (item.id) {
      return item.price + [item + qty].length;
    }
  });
  function realTotal(a) {
    var total = 0;
    for (var i in a) {
      total += a[i];
    }
    return total;
  }
  console.log(itemsPrice);
  console.log("this is itemsTotal " + itemTotal);
  console.log(itemTotal);
  console.log(realTotal(itemTotal));
  return <div>$ {realTotal(itemTotal)}</div>;
}
