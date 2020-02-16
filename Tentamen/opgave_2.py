'''
statistics.minutes delayed.weather: number of minutes delayed (per month) caused by significant meteorological
conditions that, in the judgment of the carrier, delays or prevents the operation of a flight.
'''

import json
from pprint import pprint

# a)
with open('airports.json', 'r') as infile:
    list_of_airports = json.loads(infile.read())
    # pprint(list_of_airports)

list_of_delays = []

# create list of airport codes with delay time in meteorological conditions
for airport in list_of_airports:
    list_of_delays.append((airport['airport']['code'],airport['statistics']['minutes delayed']['weather']))

print(list_of_delays)

# b) sort airports by min_delayed_weather
# delays sorted from longest delay to smallest delay
print(sorted(list_of_delays, key=lambda x: x[1], reverse=True))

