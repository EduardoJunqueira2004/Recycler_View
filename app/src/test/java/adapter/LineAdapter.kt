package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dataclass.Place
import com.example.recyclerview.R
import java.util.ArrayList

class LineAdapter(private val dataSet: ArrayList<Place>) :
    RecyclerView.Adapter<LineAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val country: TextView
        val capital: TextView
        val habitantes: TextView

        init {
            // Define click listener for the ViewHolder's View
            country = view.findViewById(R.id.country)
            capital = view.findViewById(R.id.capital)
            habitantes = view.findViewById(R.id.habitantes)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.activity_main, viewGroup, false)

        return ViewHolder(view)
    }


    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.country.text = dataSet[position].country
        viewHolder.capital.text = dataSet[position].capital
        viewHolder.habitantes.text = dataSet[position].habitants.toString()
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
