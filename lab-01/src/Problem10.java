/**  (Population projection) The U.S. Census Bureau projects population based on
 the following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
 Write a program to display the population for each of the next five years. Assume
 that the current population is 312,032,486, and one year has 365 days.*/

public class Problem10 {
    double BirthInSeconds = 7.0;
    double DeathInSeconds = 13.0;
    double ImmigrantInSeconds = 45.0;

    double CurrentPopulation = 312032486;

    double SecondsInYears = 60 * 60 * 24 * 365;

    double NumberOfBirths = SecondsInYears / BirthInSeconds;
    double NumberOfDeaths = SecondsInYears / DeathInSeconds;
    double NumberOfImmigrants = SecondsInYears / ImmigrantInSeconds;

}
