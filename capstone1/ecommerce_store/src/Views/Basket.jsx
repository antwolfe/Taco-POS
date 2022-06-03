import React from "react";
import Button from "react-bootstrap/esm/Button";

export default function Basket({ cartItems, onAdd }) {
  // {
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

  return (
    <div>
      <h2> Cart Items </h2>
      <div>
        {cartItems.length == 0 ? (
          <div>Cart is Empty</div>
        ) : (
          <div>Cart is not empty</div>
        )}
        {console.log(cartItems)}
      </div>
      <Button variant="success">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
