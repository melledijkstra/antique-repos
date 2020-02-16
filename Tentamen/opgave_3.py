class Vehicle:
    def __init__(self, id, location):
        self.id = id
        self.location = location
        self.target_location = (-1, -1)

    def pickup(self, passenger):
        self.pickup_location = passenger.location
        self.target_location = passenger.target_location


# class Taxi
class Taxi(Vehicle):
    def __init__(self, id, location):
        super().__init__(id, location)


# class Minibus
class Minibus(Vehicle):
    def __init__(self, id, location):
        super().__init__(id, location)


class TaxiCompany:
    def __init__(self):
        self.vehicles = []
        self.assignments = {}  # k,v = (vehicle, passenger)

    def register(self, vehicle):
        self.vehicles.append(vehicle)

    def request_pickup(self, passenger):
        v = self.schedule_vehicle(passenger)
        if v == None:
            # no vehicle available
            return False
        else:
            # passenger to vehicle
            self.assignments[v] = passenger
            v.pickup(passenger)
            return True

    def schedule_vehicle(self, passenger):
        for v in self.vehicles:
            if (v.target_location == (-1, -1) and
                        abs(v.location[0] - passenger.location[0]) < 10 and
                        abs(v.location[1] - passenger.location[1]) < 10):
                if (passenger.nr_of_people <= 2 and isinstance(v, Taxi)) or (
                        passenger.nr_of_people > 2 and isinstance(v, Minibus)):
                    return v


class Passenger:
    def __init__(self, name, nr_of_people, location, target_location):
        self.name = name
        self.nr_of_people = nr_of_people
        self.location = location
        self.target_location = target_location


# main
if __name__ == '__main__':
    passengers = [
        Passenger('John', 1, (4, 4), (5, 0)),
        Passenger('Mary', 1, (5, 5), (6, 0)),
        Passenger('Ann', 4, (2, 2), (7, 0)),
        Passenger('Paul', 4, (11, 3), (7, 0)),
        Passenger('Sue', 4, (3, 8), (7, 0))
    ]

    tc = TaxiCompany()

    vehicles = [
        Taxi('taxi-one', (1, 1)),
        Taxi('taxi-two', (2, 2)),
        Minibus('mb-one', (0, 0)),
        Minibus('mb-two', (1, 1))
    ]

    for vehicle in vehicles:
        tc.register(vehicle)

    for p in passengers:
        print('Taxi available') if tc.request_pickup(p) is True else print('No taxi available at this time')

    print('-'*40)

    for vehicle, passenger in tc.assignments.items():
        print('Vehicle with id', vehicle.id, 'has passenger', passenger.name)
