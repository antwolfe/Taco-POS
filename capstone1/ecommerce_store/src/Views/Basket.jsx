import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";

export default function Basket(props) {
  const { cartItems, setCartItems, products } = props;
  const [cart, setCart] = useState([]);
  const id = products.map((product) => product.id);
  console.log(id);
  console.log(products);
  console.log(cartItems);

  //Add Item, keep Cart State
  const addItem = () => {
    const exist = id.find((item) => item === cartItems.id);
    console.log(exist);
    if (exist) {
      console.log("exist");
    } else {
      console.log("New Item");
      // setCartItems([...cartItems, { ...products, qty: 1 }]);
    }
  };

  const setQty = () => {};

  const isCartEmpty = () => {
    if (cartItems.length === 0) {
      return <div>Cart is empty</div>;
    } else {
      addItem();
      return (
        <div>
          <div>{cartItems.title}</div>
          <div>{cartItems.price}</div>
        </div>
      );
    }
  };

  // const onAdd = (product) => {
  //   const exist = cartItems.find((item) => item.id == product.id);
  //   if (exist) {
  //     console.log("exists");
  //     // setCartItems(
  //     //   cartItems.map(
  //     //     (item =
  //     //       item.id == product.id ? { ...exist, qty: exist.qty + 1 } : item)
  //     //   )
  //     // );
  //   } else {
  //     setCartItems([...cartItems, { ...product, qty: 1 }]);
  //   }
  // };
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
