/**
* Created by taghawi on 2/25/14.
*/
class Parameters
{
    private final int num_saudis;
    private final int num_expats;
    private final double productivity_mean_saudi;
    private final double productivity_mean_expat;
    private final double expat_minimum_wage;
    private final double saudi_minimum_wage;
    private final double expat_tax_percentage;
    private final double expat_tax_per_head;
    private final double reapplication_probability;
    private final double saudi_tax_percentage;
    private final double saudi_tax_per_head;
    private final double sector_spending;
    private final double love_for_variety;
    private final int num_firms;
    private final int simulation_length;
    private final int policy_change_time;
    private final double wage_std;
    private final double reservation_wage_saudi;
    private final double reservation_wage_expat;
    private final double initial_sauditization_percentage;

    public Parameters()
    {
        num_firms = 100;
        num_saudis = 3800;
        num_expats = 7000;
        productivity_mean_saudi = 6854.24 / 30;
        productivity_mean_expat = 6854.24 / 30;
        reservation_wage_saudi = 3137.39 / 30;
        reservation_wage_expat = 0;
        expat_minimum_wage = 0;
        saudi_minimum_wage = 0;
        expat_tax_percentage = 0;
        expat_tax_per_head = 0;
        reapplication_probability = 0.03 / 356;
        saudi_tax_percentage = 0;
        saudi_tax_per_head = 0;
        initial_sauditization_percentage = 0;
        sector_spending = 1000000000;
        love_for_variety = 0.5;

        simulation_length = 2000;
        policy_change_time = 1500;
        wage_std = 3137.39 / 30;
    }

    public int getNum_saudis()
    {
        return num_saudis;
    }

    public int getNum_expats()
    {
        return num_expats;
    }

    public double getProductivity_mean_saudi()
    {
        return productivity_mean_saudi;
    }

    public double getProductivity_mean_expat()
    {
        return productivity_mean_expat;
    }

    public double getExpat_minimum_wage()
    {
        return expat_minimum_wage;
    }

    public double getSaudi_minimum_wage()
    {
        return saudi_minimum_wage;
    }

    public double getExpat_tax_percentage()
    {
        return expat_tax_percentage;
    }

    public double getExpat_tax_per_head()
    {
        return expat_tax_per_head;
    }

    public double getReapplication_probability()
    {
        return reapplication_probability;
    }

    public double getSaudi_tax_percentage()
    {
        return saudi_tax_percentage;
    }

    public double getSaudi_tax_per_head()
    {
        return saudi_tax_per_head;
    }

    public double getSector_spending()
    {
        return sector_spending;
    }

    public double getLove_for_variety()
    {
        return love_for_variety;
    }

    public int getNum_firms()
    {
        return num_firms;
    }

    public int getPolicy_change_time()
    {
        return policy_change_time;
    }

    public double getWage_std()
    {
        return wage_std;
    }

    public double getReservation_wage_saudi()
    {
        return reservation_wage_saudi;
    }

    public double getReservation_wage_expat()
    {
        return reservation_wage_expat;
    }

    public double getInitial_sauditization_percentage()
    {
        return initial_sauditization_percentage;
    }

    public int getSimulation_length()
    {
        return simulation_length;
    }
}
