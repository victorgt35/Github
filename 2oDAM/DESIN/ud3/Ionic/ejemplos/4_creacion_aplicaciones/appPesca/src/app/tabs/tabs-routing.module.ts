import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TabsPage } from './tabs.page';

const routes: Routes = [
  {
    path: 'tabs',
    component: TabsPage,
    children: [
      {
        path: 'equipacion',
        loadChildren: () => import('../equipacion/tab1.module').then(m => m.Tab1PageModule)
      },
      {
        path: 'seprona',
        loadChildren: () => import('../seprona/tab2.module').then(m => m.Tab2PageModule)
      },

      {
        path: '',
        redirectTo: '/tabs/equipacion',
        pathMatch: 'full'
      }
    ]
  },
  {
    path: '',
    redirectTo: '/tabs/equipacion',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
})
export class TabsPageRoutingModule {}
