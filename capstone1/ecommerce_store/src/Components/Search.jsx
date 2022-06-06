import { useState } from "react";

export default function Search({ products, query }) {
  const [term, setTerm] = useState("");
  return (
    <div>
      {(query) => {
        setTerm(query.target.value);

        products
          .filter((val) => {
            let title = val.title;
            if (term == "") {
              return val;
            } else if (title.toLowerCase().includes(term.toLowerCase())) {
            }
          })
          .map((title) => {
            console.log(title);
            return (
              <div>
                <p>{title}</p>
              </div>
            );
          });
      }}
    </div>
  );
}
