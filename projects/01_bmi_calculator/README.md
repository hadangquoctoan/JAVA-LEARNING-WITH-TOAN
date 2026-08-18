# Project 01: Body Mass Index (BMI) Calculator

## 1. Overview and Theoretical Background

The Body Mass Index (BMI) is a standardized physiological metric defined by the World Health Organization (WHO) to assess human body mass relative to height. It is widely employed in epidemiological studies and clinical screening to categorize body composition into underweight, normal weight, overweight, and obesity classifications.

Mathematically, BMI is defined as body mass divided by the square of body height:

$$\text{BMI} = \frac{m}{h^2}$$

Where:
* $m$ denotes body mass in kilograms ($\text{kg}$).
* $h$ denotes body height in meters ($\text{m}$).

---

## 2. Learning Objectives

This project evaluates foundational competencies in Java programming, specifically:
* **Primitive Data Types & Variables**: Appropriate allocation and utilization of floating-point types (`double`).
* **Standard Input Streams**: Utilizing `java.util.Scanner` to parse user input from standard input (`System.in`).
* **Arithmetic Operations**: Formulating algebraic expressions using standard arithmetic operators (`/`, `*`).
* **Relational and Logical Expressions**: Evaluating composite conditional statements using comparison (`>=`, `<=`) and short-circuit logical operators (`&&`).
* **Formatted Output**: Standard output formatting using format specifiers (`printf` / `%.2f`).
* **Resource Management**: Explicitly releasing underlying stream resources via `.close()`.

---

## 3. Functional Specifications

The console application must execute the following sequential procedures:

1. **System Initialization and Prompt**: Display a header message announcing the initialization of the calculation routine.
2. **Height Input**: Prompt the user to enter their height in meters ($h \in \mathbb{R}^+$), reading the value as a `double`.
3. **Mass Input**: Prompt the user to enter their body mass in kilograms ($m \in \mathbb{R}^+$), reading the value as a `double`.
4. **Metric Computation**: Compute the BMI value according to the specified formula.
5. **Formatted Metric Output**: Display the calculated BMI rounded to precisely two decimal places using format specifiers.
6. **Classification Validation**: Evaluate whether the calculated BMI falls within the normal weight category ($18.5 \le \text{BMI} \le 24.9$) and output the resulting boolean value (`true` or `false`).
7. **Resource Deallocation**: Terminate the `Scanner` instance to release system resources.

---

## 4. Input and Output Specifications

### Reference Classification Range
| Category | BMI Interval ($\text{kg/m}^2$) |
| :--- | :--- |
| Underweight | $< 18.5$ |
| Normal Weight (Target Range) | $18.5 \le \text{BMI} \le 24.9$ |
| Overweight / Obese | $> 24.9$ |

### Sample Execution Trace

```text
=== CHUONG TRINH TINH CHI SO BMI ===
Nhap chieu cao (m): 1.75
Nhap can nang (kg): 68.5
BMI: 22.37
BMI binh thuong: true
```

---

## 5. Compilation and Execution

To compile and execute the program from the command line interface:

```bash
# Navigate to the project directory
cd projects/01_bmi_calculator

# Compile the source code
javac BmiCalculator.java

# Execute the compiled bytecode
java BmiCalculator
```
