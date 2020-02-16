from pprint import pprint

blue='greenpark picadilly coventgarden holborn russellsquare kingscross'
yellow='towerhill bakerstreet holborn blackfriars temple'
red='bank holborn oxford bondstreet marblearch'
brown='bakerstreet oxford picadilly charingcross'
lines_london = [blue, yellow, red, brown]

# (a)
list_of_lines = [i.split(' ') for i in lines_london]
set_of_stations = set()
for stations in list_of_lines:
    for station in stations:
        set_of_stations.add(station)

print(set_of_stations, '\n')

# (b)
dict_of_stations = {}
for line in list_of_lines:
    for station in line:
        dict_of_stations[station] = []

for line in list_of_lines:
    for k,station in enumerate(line):
        if k > 0:
            dict_of_stations[station].append(line[k-1])
        if k < len(line)-1:
            dict_of_stations[station].append(line[k+1])

print(dict_of_stations, '\n')

# (c)
print('Station with max neighbours:', max(dict_of_stations, key=lambda i: len(i[1])))
    