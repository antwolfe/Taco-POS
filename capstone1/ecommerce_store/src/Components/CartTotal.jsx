import React from "react";

export default function CartTotal(props) {
  const { cartItems, itemQty } = props;
  // console.log(itemQty);
  // const itemsPrice = cartItems.reduce(
  //   (acc, item) => acc + item.price * itemQty,
  //   0
  // );

  const getNewQty = () => {};

  // getItemTotal(itemQty);

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

  console.log();
  // console.log(itemsPrice);
  // console.log("this is itemsTotal " + itemTotal);
  // console.log(itemTotal);
  // console.log(realTotal(itemTotal));
  return <div>$ {realTotal(itemTotal)}</div>;
}
