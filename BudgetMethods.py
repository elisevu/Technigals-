
#budget = [bills, groceries, clothes, other]
#budget_percentages = [bi_percent, gr_percent, cl_percent, ot_percent]

class my_budget:
    balance = 0
    budget = {}

    def change_budget(self, b, flats, priorities):
        balance = b
        can_use = balance - flats
        budget = {}
        even_per = 100.0 / (len(priorities))
        for x in range(1, len(priorities)+1):
            budg_per = even_per + randint(1,10)
            budget[x] = balance - balance*budg_per
        return budget

    def change_balance(self, diff, add=True):
        if add == true:
            balance += diff
        else:
            balance -= diff
        return None
