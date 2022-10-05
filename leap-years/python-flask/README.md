# Arabic to roman number converter endpoint

Based of [leap-years-kata](https://codingdojo.org/kata/LeapYears/)

## Requirements

- Python 3.7+
- [mob](https://mob.sh/), test that you can execute `mob moo`
- Ensure the following command runs successfully `make setup && make test`

## Task

Write a function to determine whether a given year is a leap-year or not.

1. years divisible by 4 integers are leap years, with the following exceptions.
2. years that complete a century are not leap years, with the following exception.
3. years divisible by 400 integers are again leap years. 

Examples:
* 2021 and 1999 are not leap years
* 2020 and 1996 are leap years
* 1800 and 2100 are not leap years
* 2000 and 1600 are leap years

## User story

As a user I want to have a web service interface,
so that I can check a given year to see if it is a leap year.

    Given the year 1800
    When I HTTP GET /year/1800
    Then I get an HTTP Response with status 200
    And a content-type of application/json
    And a body containing the JSON object { "isleapyear":false }
