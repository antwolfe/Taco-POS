import React from "react";

export default function CreateComment() {
  // const [comment, setComments]

  useEffect(() => {
    axios
      .post("https://dummyapi.io/data/v1/comment/create", {
        headers: {
          "app-id": "628da197616612aa51a596a1",
        },
        data: {
          message: "This is a comment",
          owner: "60d0fe4f5311236168a109ca",
          post: "This is a comment",
        },
      })
      .then((res) => {
        console.log(res);
        setComments(res.data.data);
      });
  }, []);

  return <div>CreateComment</div>;
}
