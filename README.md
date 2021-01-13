# Java-2D-Array-Filter
An implementation of a filter method for 2D arrays. Handles dynamic amount of conditions with basic AND/OR logic.

### Example Use
Create a DataProcessing object \
Side note: No real need to make this instanced; can probably make the filter() method static.
```java
DataProcessing dataProcessing = new DataProcessing();
```
Make a fake dataset (or real one I guess)
```java
String[][] myData = {
  {"Zach", "Weaver"},
  {"Jimbo", "Neutron"},
  {"MyImaginary", "Girlfriend"}
};
```

Create some conditions (column index, condition, logical)
```java
String[][] conditions = {
  {"0", "=Zach", "AND"},
  {"1", "=Weaver", "OR"},
  {"0", "=Jimbo", "AND"},
  {"1", "=Neutron", "OR"},
  {"0", "=NonExistent", ""}
};
```
The above conditions will return results where: \
0th column = Zach AND 1st column = Weaver \
OR, 0th column = Jimbo AND 1st column = Neutron \
OR, 0th column = NonExistent

Apply the filter
```java
String[][] filteredData = dataProcessing.filter(myData, conditions);
```

The ```filteredData``` would contain the following entries:
```
{
  {"Zach", "Weaver"},
  {"Jimbo", "Neutron"}
}
```
