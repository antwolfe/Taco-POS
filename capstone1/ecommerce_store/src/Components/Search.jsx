import { useState } from "react";

export default function Search({ products, query, setItems }) {
  const [results, setResults] = useState(products);
  const findProduct = () => {
    // setQuery(query);
    //create copy of all products
    // const allProducts = [...products];
    // if (query == "") {
    //   setItems(allProducts);
    // }
    const newItems = products.filter((item) => {
      if (query == "") {
        return item; //(allProducts);
      } else {
        //any item name that matches query
        return item.title.includes(query);
        // setItems(newItems);
        setResults(newItems);
      }
    });

    return <div>searched items</div>;
  };

  // return (
  //   <div>
  //     {(query) => {
  //       setTerm(query.target.value);

  //       products
  //         .filter((val) => {
  //           let title = val.title;
  //           if (term == "") {
  //             return val;
  //           } else if (title.toLowerCase().includes(term.toLowerCase())) {
  //           }
  //         })
  //         .map((title) => {
  //           console.log(title);
  //           return (
  //             <div>
  //               <p>{title}</p>
  //             </div>
  //           );
  //         });
  //     }}
  //   </div>
  // );
}
