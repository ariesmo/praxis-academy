/* 1. Import module 'express' yang telah kita install ke dalam file ini, agar bisa menggunakan framework express sepenuhnya
2. Import module 'express-graphql' untuk mengkoneksikan aplikasi express dengan graphql */

const express = require("express");
const expressGraphQL = require("express-graphql");
const schema = require("./schema/index");

const app = express();
const PORT = 4000;

app.use(
  "/graphql",
  expressGraphQL({
    schema,
    graphiql: true
  })
);

app.listen(PORT, () => {
  console.log("Server has listen at port ${PORT}");
});
