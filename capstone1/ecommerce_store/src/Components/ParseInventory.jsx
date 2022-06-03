import React, { useState } from "react";
import inventoryData from "../inventory2.json";
import ProductPreview from "./ProductPreview";

export default function ParseInventory({ products }) {
  // const [data, setData] = useState(inventoryData);
  // const bookList = data.map((book) => {
  //   return (
  //     <ProductPreview
  //       key={book.id}
  //       title={book.title}
  //       price={book.price}
  //       qty={book.qty}
  //       year={book.year}
  //     />
  //   );
  // });

  // let bookList = [];

  // products.map((product) => {
  //   bookList.push(product);
  // });
  // console.log(bookList);
  /* const getProductDetails = inventoryData.map((book, i) => {
    return <ProductPage><ProductPreview> details={} </ProductPage>
  } */

  //create inventory component and use as parent for rest of components?

  return (
    <div>
      {products.map((product) => {
        {
          return product;
        }
      })}
    </div>
  );
}
