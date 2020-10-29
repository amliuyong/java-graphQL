

http://localhost:8080/voyager
http://localhost:8080/graphiql

```graphql
query {
  characters {
    id
    name
    age
  }
}


query {
  characterById(id: "Char2") {
    name
    age
    id
  }
}

mutation {
  addCharacter(name: "my Name", age: 18) {
    id
    name
    age
  }
}


mutation {
  addGroup(name: "Group 2" orientation: HERO) {
    orientation
    name
  }
}


query {
  groups {
    name
    orientation
  }
}


query {
  groupByName(name: "Group 1") {
    name
    orientation
  }
}


mutation {
  addCharacter(name: "Yong Liu", age: 19, groupName: "Group 2") {
    name
    id
    age
    group {
      name
      orientation
      members {
        id
        name
        group {
          name
          orientation
        }
      }
    }
  }
}


```
